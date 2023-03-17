import React, { useState } from 'react';
import {
  Nav,
  NavItem,
  NavLink,
} from 'reactstrap';

function Navbar(props) {
  

    return (
<Nav pills>
    <NavItem>
        <NavLink active href="#"> Home </NavLink>
    </NavItem>
    <NavItem>
        <NavLink href="#"> Playlist </NavLink>
    </NavItem>
    <NavItem>
        <NavLink href="#"> Catálogo </NavLink>
    </NavItem>
    <NavItem>
        <NavLink href="#" > Login </NavLink>
    </NavItem>
</Nav>
  )}
 
export default Navbar;