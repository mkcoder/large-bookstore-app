import React, {PropTypes} from 'react';

import Header from './common/Header';

class App extends React.Component {
    render() {
        return (
            <div className="container">
                <Header />
                <section className="body">
                    {this.props.children}
                </section>
                <footer className="page-footer">
                  &copy; <a href="https://github.com/mkcoder" target="_blank">mkcoder</a> |
                  <a href="https://mkscodingblog.wordpress.com/" target="_blank">mycodingblog</a> |
                    <a href="https://github.com/mkcoder/large-bookstore-app" target="_blank">large-book-store app</a>
                </footer>
             </div>
        );
    }
}

App.propTypes = {
    children: PropTypes.object.isRequired
}

export default App;
