import React from 'react';
import NavBar from './NavBar.js';
import UserInfoBox from '../UserInfo/UserInfoBox.js';
import SearchBar from './SearchBar.js';

class Header extends React.Component {
  render() {
    return (
      <header className="page-header">
        <section className="logo">
          <h1 className="logo-text">Large Bookstore WebApp</h1>
          <h4 className="logo-tagline">Where books meet enterprise</h4>
        </section>
        <UserInfoBox />
        <SearchBar />
        <NavBar />
      </header>
    );
  }
}

export default Header;
