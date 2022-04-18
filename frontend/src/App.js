import {Component} from "react";
import {Footer} from "./component/footer/Footer";
import Header from "./component/header/Header";

import "./App.css";
import {NavMainContainer} from "./component/nav-main-container/NavMainContainer";

class App extends Component {

    render() {
        return (
            <div className="app-container">
                <Header/>
                <NavMainContainer/>
                <Footer/>
            </div>
        )
    }

}

export default App;
