// Set up your application entry point here...
import React from 'react';
import {render} from 'react-dom';
import {Router, browserHistory} from 'react-router';
import {Provider} from 'react-redux';
import routes from './routes';
import './styles/styles.css';
import configureStore from './store/configureStore';
import {loadBookList} from './actions/BookAction';


const store = configureStore();
store.dispatch(loadBookList());

render(
    <Provider store={store}>
        <Router history={browserHistory} routes={routes} />
    </Provider>,
    document.getElementById('app')
);
