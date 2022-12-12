import React, { useState } from 'react';

    
    
const ToDoGenerator = (props) => {
    const [toDo, setToDo] = useState([]);
    
    const handleSubmit = (e) => {
        e.preventDefault();
        props.onNewToDo( toDo );
        setToDo("");
    };
    
    return (
        <div
        // style={{
        //     display: 'flex',
        //     justifyContent: 'center',
        //     alignItems: 'center',
        // }}
        >
            <form onSubmit={ handleSubmit }>
                <h1
                    // style={{
                    //     display: 'flex',
                    //     justifyContent: 'center',
                    // }}
                >Add To Do</h1>
                <div
                    // style={{
                    //     display: 'flex',
                    //     width: '400px',
                    //     justifyContent: 'space-around',
                    // }}
                >
                    <h3>ADD something here</h3>
                    <input 
                    type="text" 
                    placeholder="Write it down before you forget it"
                    onChange={ (e) => setToDo(e.target.value) }
                    name="toDo"
                    value={ toDo }
                    />
                    <input type="submit" value="Add" />
                </div>
            </form>
        </div>
    );
};
    
export default ToDoGenerator;
