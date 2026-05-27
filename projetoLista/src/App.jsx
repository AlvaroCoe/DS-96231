import { useState } from 'react'
import './App.css'
import Header from './components/Header'
import Footer from './components/Footer'
import AdicionarUsuario from './pages/AdicionarUsuario'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Header />
    <main>
      <AdicionarUsuario />
    </main>
    <Footer />
    </>
  )
}

export default App
