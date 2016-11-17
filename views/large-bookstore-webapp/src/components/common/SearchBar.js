import React from 'react';
import {connect} from 'react-redux';
import {bindActionCreators} from 'redux';
import * as bookActions from '../../actions/BookAction';

export class SearchBar extends React.Component {
  constructor () {
    super();
    this.state = {search: ""};
    this.findByTitle = this.findByTitle.bind(this);
  }  
  findByTitle (evt) {    
    console.log(this.state);
    console.log(this.state.serach);
    this.props.actions.bookSearch(this.state.search);
    alert(this.state.search);
    evt.preventDefault();
  }
  render ( ) {
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
            <input type="search" className="form input-text" value={this.state.search} onChange={evt => this.setState({ search: evt.target.value })}/>
            <button type="submit" className="search-bar search-button" onClick={this.findByTitle}>
              <i className="fa fa-search" aria-hidden="true" />
            </button>
          </form>
        </div>
    );
  }
}

function mapStateToProps(state) {
  return {
    bookSearch: state.BookReducers.search
  };
}

function mapDispatchToProps(dispatch) {
  return {
    actions: bindActionCreators(bookActions, dispatch)
  };
}

export default connect(mapStateToProps, mapDispatchToProps)(SearchBar);