import React from 'react'
import { Link } from 'react-router-dom';
// import axios from 'axios';


const ProductList = (props) => {
    return (
        <div>
            {props.products.map((product, i) =>
                <p>
                    <Link key={i} to={`/products/${product._id}`}>{product.title}</Link>
                </p>
            )}
        </div>
    )
}

export default ProductList;