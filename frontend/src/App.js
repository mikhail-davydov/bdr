import {Component} from "react";
import Header from "./component/header/Header";

class App extends Component {

    render() {
        return (
            <div className="app">
                <Header/>
                <nav className="nav">
                    side navigation here!
                </nav>
                <main className="main">
                    main here!
                </main>
                <footer className="footer">
                    footer here!
                </footer>
            </div>
        )
    }

}

export default App;
