import React, { useState } from 'react';
import ToDoDisplay from './ToDoDisplay';
import ToDoGenerator from './ToDoGenerator';
    
    
const ToDoView = (props) => {
    const [currentToDo, setCurrentToDo] = useState([]);

    
    const addingNewToDo = ( newToDo ) => {
        const allToDo = [...currentToDo, newToDo];
        setCurrentToDo( allToDo );
    }

    const remove = (index) => {
        console.log("this works here");
        setCurrentToDo([
            ...currentToDo.slice(0, index),
            ...currentToDo.slice(index + 1)
        ]);
    }
    
    return (
        <>
        <div 
        style={{
            display: 'flex',
            justifyContent: 'center',
            flexDirection: 'column',
            alignItems: 'center',
            marginTop: '150px',
        }}>
            <ToDoGenerator onNewToDo={ addingNewToDo } />
            <ToDoDisplay className='container' toDo={ currentToDo }  delete={remove}/>
        </div>
        </>
    );
}
    
export default ToDoView;



