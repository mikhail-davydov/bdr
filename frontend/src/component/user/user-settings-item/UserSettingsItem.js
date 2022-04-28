import {Component} from "react";

import "./UserSettingsItem.css";

export class UserSettingsItem extends Component {

    render() {
        let content = this.props.content;
        let onClick = this.props.onClick;
        return (
            <li className="user-settings__item"
                onClick={() => onClick(content)}>
                {content}
            </li>
        )
    }

}