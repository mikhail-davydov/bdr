import {Component} from "react";

import "./App.css";
import {Footer} from "./component/footer/Footer";
import Header from "./component/header/Header";
import {NavMainContainer} from "./component/nav-main-container/NavMainContainer";

class App extends Component {

    constructor(props) {
        super(props);
        this.setMainContent = this.setMainContent.bind(this);
        this.state = {
            mainContent: "Начало"
        }
    }

    render() {
        return (
            <div className="app-container">
                <Header setMainContent={this.setMainContent}/>
                <NavMainContainer setMainContent={this.setMainContent} mainContent={this.state.mainContent}/>
                <Footer/>
            </div>
        )
    }

    setMainContent(content) {
        this.setState({
            mainContent: content
        })
    }

}

export default App;
