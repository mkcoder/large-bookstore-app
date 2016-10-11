import React from 'react';
import { IndexLink } from 'react-router';


const NavBar = () => {
  return (
      <nav id="top-nav-bar" className="nav-bar">
        <ul>
          <li><IndexLink to="#home" activeClassName="active">Home</IndexLink></li>
          <li><IndexLink to="/" activeClassName="active">Item 2</IndexLink></li>
          <li><IndexLink to="/" activeClassName="active">Item 3</IndexLink></li>
          <li><IndexLink to="/" activeClassName="active">Help</IndexLink></li>
        </ul>
      </nav>
  );
};

export default NavBar;
