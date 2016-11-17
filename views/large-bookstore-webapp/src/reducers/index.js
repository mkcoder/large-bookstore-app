// Set up your root reducer here...
 import { combineReducers } from 'redux';
 import BookReducers from './BookReducer.js';
 
const rootReducers = combineReducers({
     BookReducers
 });

 export default rootReducers;