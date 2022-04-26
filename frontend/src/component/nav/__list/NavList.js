import {Component} from "react";

import "./NavList.css";

export class NavList extends Component {

    render() {
        return (
            <ul className="nav__list">
                {this.props.items}
            </ul>
        )
    }

}