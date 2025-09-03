import { useState } from 'react'
import './App.css'
import Game from './Tic-Tac_Toe/Game.jsx'
function App() {
  const [count, setCount] = useState(0)
  return (
    <>
      <Game />
    </>
  )
}

export default App
