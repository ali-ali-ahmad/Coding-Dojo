import React, { useState, useEffect } from "react";
import axios from "axios";
import {useParams} from "react-router";
import { Link } from 'react-router-dom';
import { useNavigate } from "react-router-dom";

const Detail = (props) => {
    const [product, setProduct] = useState();
    const [loaded, setLoaded] = useState(false);
    const {id} = useParams();
    const navigate = useNavigate();

    useEffect (() =>{
        axios.get('http://localhost:8000/api/products/' +id)
            .then(res => {
                setProduct(res.data);
                setLoaded(true);
                console.log("this is in the details");
            })
            .catch(err => console.error(err))
    }, [id]);

    const deleteProduct = (productId) => {
        axios.delete('http://localhost:8000/api/products/' + productId)
            .then(res => 
                setProduct(""),
                navigate("/products")
            )
            .catch(err => console.error(err));
    }

    // const removeFromDom = productId => {
    //     setProducts(products.filter(product => product._id !== productId));
    // }

    return (
        <div>
            {loaded && 
            <div>
                <div>
                    <p>Product title: {product.title}</p>
                    <p>Product price: {product.price}$</p>
                    <p>Product Description: {product.description}</p>
                </div>
                <Link to={'/products'}>back</Link>
                |
                <Link to={"/products/" + product._id + "/edit"}>
                    Edit
                </Link>
                |
                <button onClick={(e)=>{deleteProduct(product._id)}}>
                    Delete
                </button>
            </div>
            }
        </div>
    )
}

export default Detail