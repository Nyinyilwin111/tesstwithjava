import { useState } from 'react'

function Mybutton2() {
  const [count, counting] = useState(0);
  return (
    <button 
    onClick={() => counting(count + 1)}
    >
    Click me! {count}
    </button>
  );
}
export default Mybutton2;
