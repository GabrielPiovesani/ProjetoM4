import React from 'react';
import {Nav, Navbar} from "react-bootstrap";
import logo from "../../assets/img/Logo.png";

const LoginHeader = () => {
    return (
        <Navbar className='d-flex justify-content-center w-100'  style={{ backgroundColor: '#000000', boxShadow: '5 5px 10px rgba(0,0,0,0.5)' }} expand="lg" >

            <Navbar.Brand className="d-flex align-items-center">
                <img
                    src={logo}
                    width="100"
                    height="40"
                    className="d-inline-block"
                    alt="Logo"
                />
            </Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />

        </Navbar>
    );
}

export default LoginHeader;
