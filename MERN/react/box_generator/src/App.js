import React, { useState } from 'react';
import BoxForm from './Components/BoxForm';
import BoxDisplay from './Components/BoxDisplay';

    
    
function App() {
    const [currentWidth, setCurrentWidth] = useState(0);
    const [currentHeight, setCurrentHeight] = useState(0);
    const [currentColor, setCurrentColor] = useState('');
    const [currentBox, setCurrentBox] = useState([]);
    
    const newBox = {
      width: currentWidth,
      height: currentHeight,
      color: currentColor,
    };

    setCurrentBox([...currentBox, newBox]);

    
    // const addingNewBox = ( newBox ) => {
    //     const allBoxes = [...currentBox, newBox];
    //     setCurrentBox( allBoxes );
    // }
    
    return (
        <>
            <BoxForm width={ setCurrentWidth } height={setCurrentHeight} color={setCurrentColor}/>
            <BoxDisplay className='container' box={ currentBox } />

        </>
    );
}
    
export default App;


