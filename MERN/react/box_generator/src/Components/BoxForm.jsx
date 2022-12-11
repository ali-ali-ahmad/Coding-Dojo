import React, { useState } from 'react';

    
    
const BoxForm = (props) => {
    // const [box, setBox] = useState("");
    
    const [width, setWidth] = useState(0);
    const [height, setHeight] = useState(0);
    const [color, setColor] = useState('');
    const [boxes, setBoxes] = useState([]);

    const handleSubmit = (e) => {
        e.preventDefault();
        props.width( width );
        props.height( height );
        props.color( color );

        const newBox = {
            width: width,
            height: height,
            color: color,
        };
    
          // add the new box to the list of boxes
        setBoxes([...boxes, newBox]);

    };
    
    return (
        <div
        style={{
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
        }}
        >
        <form onSubmit={handleSubmit}>
            <label>
                Width:
                <input type="number" value={width} onChange={e => setWidth(e.target.value)} />
            </label>
            <label>
                Height:
                <input type="number" value={height} onChange={e => setHeight(e.target.value)} />
            </label>
            <label>
                Color:
                <input type="text" value={color} onChange={e => setColor(e.target.value)} />
            </label>
            <input type="submit" value="Generate Box" />
        </form>
        </div>
    );
};
    
export default BoxForm;
