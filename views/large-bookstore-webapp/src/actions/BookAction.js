import * as bookConstants from '../constants/BookConstants';

export function bookSearch(bookSearch) {
    return  { type: bookConstants.BOOK_SEARCH, bookSearch };
}

export function allBooksListLoaded(books) {
    return { type: bookConstants.ALL_BOOKS_LOADED, books};    
}

export function loadBookList() {
    return function(dispatch) {
        return fetch('http://localhost:8080/rest/book/book/all')
        .then(response  => response.text())
        .then(text      => JSON.parse(text))
        .then(json      => dispatch(allBooksListLoaded(json)))
        .catch( error   => {throw(error);}); 
    };
}