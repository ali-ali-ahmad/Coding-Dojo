import React, { useState } from 'react';
import BoxForm from './Components/BoxForm';
import BoxDisplay from './Components/BoxDisplay';
    
    
function App() {
    const [currentBox, setCurrentBox] = useState([]);
    
    const addingNewBox = ( newBox ) => {
      const allBoxes = [...currentBox, newBox];
      setCurrentBox( allBoxes );
    }
    
    return (
        <>
          <BoxForm onNewBox={ addingNewBox } />
          <BoxDisplay className='container' box={ currentBox } />
        </>
    );
}
    
export default App;


