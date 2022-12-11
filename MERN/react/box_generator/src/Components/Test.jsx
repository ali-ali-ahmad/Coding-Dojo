import React, { useState } from 'react';

function BoxGenerator() {
  // useState hook to manage the state of the form
  const [width, setWidth] = useState(0);
  const [height, setHeight] = useState(0);
  const [color, setColor] = useState('');
  const [boxes, setBoxes] = useState([]);

  // function to handle form submission
  const handleSubmit = (e) => {
    // prevent default form submission behavior
    e.preventDefault();

    // create a new box object using the form values
    const newBox = {
      width: width,
      height: height,
      color: color,
    };

    // add the new box to the list of boxes
    setBoxes([...boxes, newBox]);
  }

  return (
    <div>
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
      {/* map over the list of boxes to render each one */}
      {boxes.map((box, i) => (
        <div
          key={i}
          style={{
            width: box.width + 'px',
            height: box.height + 'px',
            backgroundColor: box.color,
          }}
        />
      ))}
    </div>
  );
}

export default BoxGenerator;
