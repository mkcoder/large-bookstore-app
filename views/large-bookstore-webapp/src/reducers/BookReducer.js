import * as bookConstants from '../constants/BookConstants';

export default function BookReducers(state = {search: "", books: []}, action) {
    switch ( action.type ) {
        case bookConstants.ALL_BOOKS_LOADED:
            return Object.assign({}, state, {books: action.books});
        case bookConstants.BOOK_SEARCH:
        // you should call an api for the search here
            return Object.assign({}, state, {search: action.book_search});
        default:
            return state;
    }
}