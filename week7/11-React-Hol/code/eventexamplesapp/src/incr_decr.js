import React, { useState } from 'react';
function Counter() {
  const [count, setCount] = useState(0);
  const handleIncrement = () => {
    setCount(prevCount => prevCount + 1);
    window.alert("Hello user");
  };
  const handleDecrement = () => {
    setCount(prevCount => prevCount - 1);
  };

  return (
    <div style={{ padding: '10px 20px'}} >
      <p style={{ fontSize: '2rem', margin: '20px 0' }}>{count}</p>
      <div>
        <button onClick={handleDecrement} style={{ padding: '10px 20px', marginRight: '10px', fontSize: '1rem' }}>
          Decrement
        </button>
        <br></br>
        <button onClick={handleIncrement} style={{ padding: '10px 20px', fontSize: '1rem' }}>
          Increment
        </button>
      </div>
    </div>
  );
}
export default Counter;