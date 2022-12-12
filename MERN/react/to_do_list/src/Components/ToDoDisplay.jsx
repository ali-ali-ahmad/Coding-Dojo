// import React, { useState } from 'react';
import React, { useState } from 'react';
import { useChecklist } from 'react-checklist';
import './ToDoDisplay_style.css';

const ToDoDisplay = (props) => {
    
    const { handleCheck, checkedItems } = useChecklist(props.toDo);
    const [deletedList, setDeletedList] = useState([]);

    const handleDelete = (index) => {
        // e.preventDefault();
        setDeletedList([...deletedList, props.toDo[index]]);
        props.delete(index);
    };
    
    return (
        <>
            <h1>Your To Do List</h1>
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
                            <input type='submit' onClick={()=>handleDelete(i)} value="Delete"/>
                        </li>
                        ))}
                    </ul>
                </div>
                <div>
                    <h3>Deleted To Do List</h3>
                    <div className='checkbox-rect'>
                        <ul className='checklist'>
                            {deletedList.map((x, i) => (
                                <li key={i}>
                                <label>{x}</label>
                            </li>
                            ))}
                        </ul>
                    </div>
                </div>
            </div>
        </>
    );
};
    
export default ToDoDisplay;

