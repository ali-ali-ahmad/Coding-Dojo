import React, { useState, useEffect } from "react";
import axios from "axios";
import {useParams} from "react-router";
import { Link } from 'react-router-dom';
import { useNavigate } from "react-router-dom";
import DeleteButton from '../components/DeleteButton';
import EditIcon from '@mui/icons-material/Edit';
import Fab from '@mui/material/Fab';
import CardContent from '@mui/material/CardContent';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import Typography from '@mui/material/Typography';

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

    return (
        <div>
            <Link to={'/products'}>back</Link>
            {loaded && 
            <Card sx={{ maxWidth: 345 }}>
                <CardContent>
                    <Typography gutterBottom variant="h5" component="div">
                        {product.title}
                    </Typography>
                    <Typography variant="body2" color="text.secondary">
                        Description:
                        {product.description}
                    </Typography>
                    <Typography gutterBottom variant="h5" component="div">
                        Price: {product.price}$
                    </Typography>
                </CardContent>
                <CardActions>
                    <Link to={"/products/" + product._id + "/edit"}>
                        <Fab color="secondary" aria-label="edit">
                            <EditIcon/>
                        </Fab>
                    </Link>
                    <DeleteButton productId={product._id} successCallback={() => navigate("/products")} />
                </CardActions>
            </Card>
            }
        </div>
    )
}

export default Detail