import React, {useState} from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import { Link } from 'react-router-dom';


const AuthorForm = (props) => {
    const {initialName, onSubmitProp, errorsGen} = props;
    const [name, setName] = useState(initialName);


    const onSubmitHandler = (e) => {
        e.preventDefault();
        onSubmitProp({name});
        
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
                            value={name}
                            helperText={errorsGen.map((err, index) => <p key={index}>{err}</p>)}
                            type='text'
                            onChange={(e) => setName(e.target.value)}
                            />
                    </p>
                </div>
                <Button type='submit' variant="contained" color="success">Submit</Button>
                <Button variant="contained" color="success"><Link to={'/'}>Cancel</Link></Button>
            </form>
        </>
    )
}

export default AuthorForm;