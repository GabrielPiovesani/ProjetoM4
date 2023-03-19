
import React, {Component} from 'react';
import './App.css'
// import Navbar from './Pages/Home/Navbar.jsx'
// import Carrosel from './Pages/Home/Carrosel.jsx'
// import Footer from './Pages/Home/Footer.jsx'
import Login from './Pages/Login/LoginMenu.jsx';
import Form from './Pages/Login/Form.jsx';
import Footer from './Pages/Login/FooterLogin.jsx';
import './Pages/Login/Login.css';

class App extends Component{
  render(){
    return (
      <div className="App">
       {/* <Navbar></Navbar>
       <Carrosel></Carrosel>
       <Footer/> */}
        <Login></Login>
        <Form></Form>
        <Footer></Footer>

      </div>
    )
  }
}
export default App




// function App() {
//   return (
//     <div className="App">
     {/* <Navbar></Navbar>
     <Carrosel></Carrosel>
     <Footer/> */}
      {/* <Login>
      </Login>
    </div>
  )
}

export default App */}


