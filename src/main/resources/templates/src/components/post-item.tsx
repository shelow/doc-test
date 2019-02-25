import * as React from 'react'
import {Post} from '../store/Interfaces'

interface Props {
  item: Post
}

export class PostItem extends React.Component<Props> {
  render () {
    return <div>
            <div>{this.props.item.title}</div>
            <div>{this.props.item.body}</div>
        </div>
  }
}
