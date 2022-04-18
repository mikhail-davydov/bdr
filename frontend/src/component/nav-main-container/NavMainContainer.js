import {Component} from "react";

import "./NavMainContainer.css";
import {Main} from "../main/Main";
import {Nav} from "../nav/Nav";

export class NavMainContainer extends Component {

    render() {
        return (
            <div className="nav-main-container">
                <Nav/>
                <Main/>
            </div>
        )
    }

}