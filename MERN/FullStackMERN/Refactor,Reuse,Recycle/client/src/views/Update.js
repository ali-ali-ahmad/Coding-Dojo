import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams, useNavigate } from "react-router-dom";
import ProductForm from '../components/ProductForm';
import DeleteButton from '../components/DeleteButton';
import { Link } from 'react-router-dom';
    
const Update = (props) => {
    const { id } = useParams();
    const [product, setProduct] = useState();
    const [loaded, setLoaded] = useState(false);
    const navigate = useNavigate();
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/products/' + id)
            .then(res => {
                setProduct(res.data);
                setLoaded(true);
                console.log("this is in the update component")
            })
    }, [id]);
    
    const updateProduct = product => {
        axios.put('http://localhost:8000/api/products/' + id, product)
            .then(res => console.log(res), navigate("/products/" + id))
            .catch(err => console.error(err));
    }
    
    return (
        <>
            <div>
                <Link to={'/products/'}>back</Link>
                <h1>Update a Person</h1>
                {loaded && (
                    <>
                        <ProductForm
                            onSubmitProp={updateProduct}
                            initialTitle={product.title}
                            initialPrice={product.price}
                            initialDescription={product.description}
                        />
                        <DeleteButton productId={product._id} successCallback={() => navigate("/products")} />
                    </>
                )}
            </div>
        </>
    )
}
    
export default Update;

