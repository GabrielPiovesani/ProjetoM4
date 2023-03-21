import React from 'react';
import LoginMenu from '../../components/LoginMenu/LoginMenu.jsx';
import Form from '../../components/Form/Form.jsx';
import CarroselPage from '../../components/Carrossel/Carrosel.jsx';
import Catalogo from '../Catalogo/Catalogo.jsx';
import Footer from '../../components/Footer/Footer.jsx';






const Login =()=> {
    return (
      
        <div className="Login-background">
         <LoginMenu/>
            <Form />
            <Footer/>
        
        </div>
            
    );


}

export default Login;