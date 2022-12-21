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



const AuthorList = (props) => {
    const { removeFromDom } = props;

    return (
        <TableContainer component={Paper}>
            <Table sx={{ minWidth: 650 }} size="small" aria-label="a dense table">
                <TableHead>
                    <TableRow>
                        <TableCell align="center">Author Name</TableCell>
                        <TableCell align="center">Action</TableCell>
                    </TableRow>
                </TableHead>
                <TableBody>
                {props.authors.sort().map((author, inx) => {
                    return(
                    <TableRow
                        key={inx}
                        sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                    >
                        <TableCell component="th" scope="row" align="center">
                        <Link to={`/authors/${author._id}`}>{author.name}</Link>
                        </TableCell>
                        <TableCell align="center">
                            <Box sx={{ '& > :not(style)': { m: 1 } }}>
                                <Link to={"/authors/" + author._id + "/edit"}>
                                    <Fab color="secondary" aria-label="edit">
                                        <EditIcon/>
                                    </Fab>
                                </Link>
                            </Box>
                            <DeleteButton authorId={author._id} successCallback={()=>removeFromDom(author._id)}/>
                        </TableCell>
                    </TableRow>
                    )
                })}
                </TableBody>
            </Table>
        </TableContainer>
    )
}

export default AuthorList;