import React, {useState, useEffect} from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import { Link } from 'react-router-dom';
import io from 'socket.io-client';
// import React, { useState, useEffect } from 'react';


const PlayerForm = (props) => {
    // const {initialName, initialPosition, onSubmitProp, errorsGen} = props;
    const [txt, setTxt] = useState();
    const [messages, setMessages] = useState([]);
    // const [position, setPosition] = useState(initialPosition);
    const [socket] = useState(() => io(':8000'));

    useEffect(() => {
        // we need to set up all of our event listeners
        // in the useEffect callback function
        console.log('Is this running?');
        socket.on('Welcome', data => console.log(data));
        socket.on("chat", setMessages([...messages, data]));

        // note that we're returning a callback function
        // this ensures that the underlying socket will be closed if App is unmounted
        // this would be more critical if we were creating the socket in a subcomponent
        return () => socket.disconnect(true);
    }, 
    // []
    );

    const onSubmitHandler = (e) => {
        e.preventDefault();
        socket.emit("chat", txt);

        // onSubmitProp({name, position});
        
    }

    return  (
        <>
            <form onSubmit={onSubmitHandler}>
                <div>
                    <Box
                    component="form"
                    sx={{
                        '& .MuiTextField-root': { m: 1, width: '25ch' },
                    }}
                    noValidate
                    autoComplete="off"
                    ></Box>
                    <p>
                        <TextField
                            // error
                            id="outlined-error-helper-text"
                            label="Name"
                            value={txt}
                            // helperText={errorsGen.map((err, index) => <p key={index}>{err}</p>)}
                            type='text'
                            onChange={(e) => setTxt(e.target.value)}
                        />
                    </p>
                </div>
                <Button type='submit' variant="contained" color="success">Submit</Button>
            </form>
        </>
    )
}

export default PlayerForm;