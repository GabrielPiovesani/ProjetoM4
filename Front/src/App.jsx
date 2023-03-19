import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './pages/Home/Home.jsx';
import Inicio from './pages/Inicio/Inicio.jsx'



function App() {

  return (
    <div className="App">
      <Router>
      <Routes>
      <Route path='/' element={<Inicio/>} />
      <Route path="/home" element={<Home />} />
      <Route />
      <Route />
      <Route />
      </Routes>
        </Router> 
    </div>
  )
}

export default App
