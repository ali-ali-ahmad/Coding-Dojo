import { Link } from 'react-router-dom';
import DeleteButton from './DeleteButton';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import EditIcon from '@mui/icons-material/Edit';
import Fab from '@mui/material/Fab';
import Box from '@mui/material/Box';



const ProductList = (props) => {
    const { removeFromDom } = props;

    return (
        <TableContainer component={Paper}>
            <Table sx={{ minWidth: 650 }} size="small" aria-label="a dense table">
                <TableHead>
                    <TableRow>
                        <TableCell align="center">Title</TableCell>
                        <TableCell align="center">Price$</TableCell>
                        <TableCell align="center">Action</TableCell>
                    </TableRow>
                </TableHead>
                <TableBody>
                    {props.products.map((product, idx) => (
                    <TableRow
                        key={idx}
                        sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                    >
                        <TableCell component="th" scope="row" align="center">
                        <Link to={`/products/${product._id}`}>{product.title}</Link>
                        </TableCell>
                        <TableCell align="center">{product.price}$</TableCell>
                        <TableCell align="center">
                            <Box sx={{ '& > :not(style)': { m: 1 } }}>
                                <Link to={"/products/" + product._id + "/edit"}>
                                    <Fab color="secondary" aria-label="edit">
                                        <EditIcon/>
                                    </Fab>
                                </Link>
                            </Box>
                            <DeleteButton productId={product._id} successCallback={()=>removeFromDom(product._id)}/>
                        </TableCell>
                    </TableRow>
                    ))}
                </TableBody>
            </Table>
        </TableContainer>
    )
}

export default ProductList;