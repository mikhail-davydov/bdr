import {Component} from "react";

import "./UserSettingsItem.css";

export class UserSettingsItem extends Component {

    render() {
        return (
            <li className="user-settings__item"
                onClick={this.props.onClick}>
                {this.props.content}
            </li>
        )
    }

}