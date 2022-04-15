import {Component} from "react";

import "./UserSettings.css";

export class UserSettings extends Component {

    render() {
        return (
            <ul className={this.props.className}>
                {this.props.content}
            </ul>
        )
    }

}