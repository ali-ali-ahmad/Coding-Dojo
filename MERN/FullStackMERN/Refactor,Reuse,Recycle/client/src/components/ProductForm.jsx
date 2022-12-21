import React, {useState} from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';

const ProductForm = (props) => {
    const {initialTitle, initialPrice, initialDescription, onSubmitProp} = props;
    const [title, setTitle] = useState(initialTitle);
    const [price, setPrice] = useState(initialPrice);
    const [description, setDescription] = useState(initialDescription);

    const onSubmitHandler = e => {
        e.preventDefault();
        onSubmitProp({title, price, description});
        setTitle("");
        setPrice("");
        setDescription("");
    }

    return  (
        <form onSubmit={onSubmitHandler}>
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
                    label="Title"
                    value={title}
                    // helperText="Incorrect entry."
                    type='text'
                    onChange={(e) => setTitle(e.target.value)}
                />
            </p>
            <p>
                <TextField
                    // error
                    id="outlined-error-helper-text"
                    label="Price"
                    value={price}
                    // helperText="Incorrect entry."
                    type="number"
                    onChange={(e) => setPrice(e.target.value)}
                />
            </p>
            <p>
                <TextField
                    // error
                    id="outlined-error-helper-text"
                    label="Description"
                    value={description}
                    // helperText="Incorrect entry."
                    type='text'
                    onChange={(e) => setDescription(e.target.value)}
                />
            </p>
            <Button type='submit' variant="contained" color="success">Submit</Button>
        </form>
    )
}

export default ProductForm;