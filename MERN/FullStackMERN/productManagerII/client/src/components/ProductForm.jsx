import React, {useState} from 'react';
import axios from 'axios';

const ProductForm = () => {
    const [title, setTitle] = useState();
    const [price, setPrice] = useState();
    const [description, setDescription] = useState();
    // const [products, setProducts] = useState();

    // const newProduct = {
    //     title: title,
    //     price: price,
    //     description: description,
    // };
    // setProducts( newProduct );


    // const handleSubmit = (e) => {
    //     e.preventDefault();
    //     props.onNewToDo( toDo );
    //     props.onNewProduct(title, price, description);
    //     setToDo("");
    // };


    const onSubmitHandler = e => {
        e.preventDefault();
        axios.post('http://localhost:8000/api/products', {
            title,
            price,
            description
        })
        .then(res => 
            console.log(res), 
            setTitle(""),
            setPrice(""),
            setDescription("")
            )
        .catch(err => console.log(err))
    }

    // const onSubmitHandler = (props, e) => {
    //     e.preventDefault();
    //     axios.post('http://localhost:8000/api/products', {
    //         title,
    //         price,
    //         description
    //     })
    //     .then(res => 
    //         console.log(res), 
    //         // props.onNewProduct(products),
    //         // props.onNewTitle(title),
    //         // props.onNewPrice(price),
    //         // props.onNewDescription(description),
    //         setTitle(""),
    //         setPrice(""),
    //         setDescription("")
    //         )
    //     .catch(err => console.log(err))
    // }

    return  (
        <form onSubmit={onSubmitHandler}>
            <p>
                <label>Title</label><br/>
                <input type='text' onChange={(e) => setTitle(e.target.value)} value={title}/>
            </p>
            <p>
                <label>Price</label><br/>
                <input type="number" onChange={(e) => setPrice(e.target.value)} value={price}/>
            </p>
            <p>
                <label>Description</label><br/>
                <input type="text" onChange={(e) => setDescription(e.target.value)} value={description}/>
            </p>
            <input type="submit" value="Create"/>
        </form>
    )
}

export default ProductForm;