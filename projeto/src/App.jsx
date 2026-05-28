import { useState } from 'react'
import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'
import Clientes from './pages/Clientes'

export default function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Header/>
        <main>
          <Clientes/>
        </main>
      <Footer/>
      
    </>
  )
}


