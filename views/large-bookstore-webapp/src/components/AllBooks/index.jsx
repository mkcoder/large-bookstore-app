import React from 'react';
import BookList from './BookList';
import {connect} from 'react-redux';
import {bindActionCreators} from 'redux';
import * as bookActions from '../../actions/BookAction';

class ViewAllBooks extends React.Component {
    constructor() {
        super();
        
    };

    render () {        
        return (
            <section>
                {this.props.books.map(BookList)}
            </section>
        );
    };
}


function mapStateToProps(state) {
  return {    
    books: state.BookReducers.books
  };
}

function mapDispatchToProps(dispatch) {
  return {
    actions: bindActionCreators(bookActions, dispatch)
  };
}

export default connect(mapStateToProps, mapDispatchToProps)(ViewAllBooks);