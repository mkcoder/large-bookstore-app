import React from 'react';

export default class SearchBar extends React.Component {
  render( ) {
    return (
        <div className="search-bar">
          <form action="">
            <div className="form dropdown-list book-genre">
              <select name="book-genre" id="search-book-genre">
                <option value="all">Select a genre</option>
                <option value="fantasy">Fantasy</option>
                <option value="mystery">Mystery</option>
                <option value="self-help">Self help</option>
              </select>
            </div>
            <input type="search" className="form input-text"/>
            <button type="submit" className="search-bar search-button">
              <i className="fa fa-search" aria-hidden="true" />
            </button>
          </form>
        </div>
    );
  }
}
