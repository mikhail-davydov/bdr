import {Component} from "react";

import "./UserSettingsItem.css";

export class UserSettingsItem extends Component {

    render() {
        let settingName = this.props.settingName;
        let settingContent = this.props.settingContent;
        let onClick = this.props.onClick;
        return (
            <li className="user-settings__item"
                onClick={() => onClick(settingContent)}>
                {settingName}
            </li>
        )
    }

}