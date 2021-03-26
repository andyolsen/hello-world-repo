import React from "react";
import { NavLink } from "react-router-dom";
import "./Menu.css";

function Menu() {
    return (
		<nav>
			<NavLink exact to="/">Home</NavLink>&nbsp;|&nbsp;
			<NavLink to="/destinations">Destinations</NavLink>&nbsp;|&nbsp;
			<NavLink to="/about">About</NavLink>
		</nav>
    )
}
export default Menu;

