import {Component} from "react";
import {Main} from "../main/Main";
import {Nav} from "../nav/Nav";

import "./NavMainContainer.css";

export class NavMainContainer extends Component {

    render() {
        return (
            <div className="nav-main-container">
                <Nav setMainContent={this.props.setMainContent}/>
                <Main mainContent={this.props.mainContent}/>
            </div>
        )
    }

}