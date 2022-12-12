// import React, { useState } from 'react';
// import React, { useState } from 'react';
import { useChecklist } from 'react-checklist';
import './ToDoDisplay_style.css';

const ToDoDisplay = (props) => {
    
    const { handleCheck, checkedItems } = useChecklist(props.toDo);

    const handleDelete = (e) => {
        // e.preventDefault();
        props.delete(e);
    };
    
    return (
        <>
            <h1>Your To Do List</h1>
            <div className='grid-container'>
                <div className='box'>
                    <div className='item'>
                        <div className='checkbox-rect'>
                            <ul className='checklist'>
                                {props.toDo.map((v, i) => (
                                    <li key={i}>
                                    <input
                                    type="checkbox"
                                    data-key={v}
                                    onChange={handleCheck}
                                    checked={checkedItems.has(v)}
                                    />
                                    <label>{v}</label>
                                    {/* <button type='submit' onClick={()=>remove(i)}>Delete</button> */}
                                    <input type='submit' onClick={()=>handleDelete(i)} value="Delete"/>
                                </li>
                                ))}
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
    // return (
    //     <>
    //         <h1>Your To Do List</h1>
    //         <ul className="container">
    //             { props.toDo.map( (toDo, i) => 
    //                 <li 
    //                 key={ i }
    //                 // style={{
    //                 //     width: '200px',
    //                 //     height: '200px',
    //                 //     display: 'inline-grid',
    //                 //     justifyContent: 'center',
    //                 //     alignItems: 'center',
    //                 // }}
    //                 >{ toDo }</li> ) }
    //         </ul>

    //     </>
    // );
};
    
export default ToDoDisplay;

