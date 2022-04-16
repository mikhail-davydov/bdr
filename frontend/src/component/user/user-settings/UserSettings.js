import {Component} from "react";

import "./UserSettings.css";

export class UserSettings extends Component {

    render() {
        let className = this.getUserSettingsClassName();
        return (
            <ul className={className}>
                {this.props.content}
            </ul>
        )
    }

    getUserSettingsClassName() {
        return this.props.isVisible ? "user-settings visible" : "user-settings";
    }

}