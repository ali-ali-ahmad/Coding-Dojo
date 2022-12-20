import React, {useState, useEffect} from 'react'
import axios from 'axios';
import ProductForm from '../components/ProductForm';
import ProductList from '../components/ProductList';

const Main = (props) => {

    // const [title, setTitle] = useState();
    // const [price, setPrice] = useState();
    // const [description, setDescription] = useState();
    const [products, setProducts] = useState();
    const [loaded, setLoaded] = useState(false);

    // const newProduct = {
    //     title: title,
    //     price: price,
    //     description: description,
    // };
    // setProducts( newProduct );

    // const addingNewProduct = ( newProduct ) => {
    //     // const allToDo = [...currentToDo, newToDo];
    //     setProducts( newProduct );
    // }

    useEffect (() =>{
        axios.get('http://localhost:8000/api/products')
            .then(res => {
                // setTitle(res.data);
                // setPrice(res.data);
                // setDescription(res.data);
                setProducts(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    }, [products]);

    return (
        <div>
            <ProductForm/>
            {/* <ProductForm onNewProduct={setProducts}/> */}
            {/* <ProductForm onNewTitle={products.title} onNewPrice={products.price} onNewDescription={products.description}/> */}
            <br/>
            {loaded && <ProductList products={products}/>}
        </div>
    )
};

export default Main;



