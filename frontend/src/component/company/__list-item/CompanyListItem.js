import {Component} from "react";

import "./CompanyListItem.css";

class CompanyListItem extends Component {

    render() {
        return (
            <li className="company__list-item"
                onClick={this.props.onClick}>
                {this.props.content}
            </li>
        )
    }

}

export default CompanyListItem;