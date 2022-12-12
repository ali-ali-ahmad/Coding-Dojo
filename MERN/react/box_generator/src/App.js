import React, { useState } from 'react';
import BoxForm from './Components/BoxForm';
import BoxDisplay from './Components/BoxDisplay';
// import ThreeInOne from './Components/ThreeInOne';
    
    
function App() {
    const [currentBox, setCurrentBox] = useState([]);

    
    const addingNewBox = ( newBox ) => {
        // const allBoxes = [...currentBox, newBox];
        setCurrentBox( [...currentBox, newBox] );
    }
    
    return (
        <>
            <BoxForm onNewBox={ addingNewBox } />
            <BoxDisplay className='container' box={ currentBox } />
            {/* <ThreeInOne/> */}
        </>
    );
}
    
export default App;


