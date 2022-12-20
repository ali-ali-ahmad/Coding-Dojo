import React, { useState, useEffect } from "react";
import axios from "axios";
import {useParams} from "react-router";
import { Link } from 'react-router-dom';

const Detail = (props) => {
    const [product, setProduct] = useState();
    const [loaded, setLoaded] = useState(false);
    const {id} = useParams();

    useEffect (() =>{
        axios.get('http://localhost:8000/api/products/' +id)
            .then(res => {
                setProduct(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err))
    }, [id]);

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
            </div>
            }
        </div>
    )
}

export default Detail