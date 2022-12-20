import { Link } from 'react-router-dom';
import DeleteButton from './DeleteButton';


const ProductList = (props) => {
    const { removeFromDom } = props;

    return (
        <div>
            {props.products.map((product, idx) => {
                return (
                    <p key={idx}>
                        <Link to={`/products/${product._id}`}>{product.title}</Link>
                        |
                        <Link to={"/products/" + product._id + "/edit"}>Edit</Link>
                        |
                        <DeleteButton productId={product._id} successCallback={()=>removeFromDom(product._id)}/>
                    </p>
                )
            })}
        </div>
    )
}

export default ProductList;